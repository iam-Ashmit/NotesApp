package com.ashmit.notesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ashmit.ashmitnotesapp.NotesModel
import com.ashmit.notesapp.databinding.FragmentNotesBinding


class NotesFragment : Fragment() {
    lateinit var binding : FragmentNotesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotesBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrNotes = ArrayList<NotesModel>()
        arrNotes.add(NotesModel("Book Title" , "hello this is the best book"))
        arrNotes.add(NotesModel("abcd" , "hello this is the best book"))
        arrNotes.add(NotesModel("xyz" , "hello this is the best book"))
        arrNotes.add(NotesModel("hululu" , "hello this is the best book"))
        arrNotes.add(NotesModel("Bonjour" , "hello this is the best book"))

        binding.notesRecycView.layoutManager = LinearLayoutManager(requireContext())
        val recyclerNotesAdapter = RecyclerNotesAdapter(requireContext() , arrNotes)
        binding.notesRecycView.adapter = recyclerNotesAdapter

    }

}