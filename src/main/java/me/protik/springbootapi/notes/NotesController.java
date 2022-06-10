package me.protik.springbootapi.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.basic.BasicListUI;
import java.util.Arrays;
import java.util.List;

@RestController
public class NotesController {
    @Autowired
    private NotesService notesService;

    @RequestMapping("/notes")
    public List<Notes> getAllNote(){
        return notesService.getAllNotes();
    }
    @RequestMapping("/notes/{id}")
    public Notes getOneNote(@PathVariable String id){
        return notesService.getOneNote(id);
    }
}
