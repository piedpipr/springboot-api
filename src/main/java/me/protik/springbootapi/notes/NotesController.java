package me.protik.springbootapi.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.basic.BasicListUI;
import java.util.Arrays;
import java.util.List;

@RestController
public class NotesController {
    @Autowired
    private NotesService notesService;

    @RequestMapping("/notes")
    public List<Notes> getAllNoteC(){
        return notesService.getAllNotesS();
    }
    @RequestMapping("/notes/{id}")
    public Notes getOneNoteC(@PathVariable String id){
        return notesService.getOneNoteS(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/notes")
    public void addNoteC(@RequestBody Notes note){
        notesService.addNoteS(note);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/notes/{id}")
    public void editNoteC(@RequestBody Notes note,@PathVariable String id){
        notesService.editNoteS(note, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/notes/{id}")
    public void deleteNoteC(@PathVariable String id){
        notesService.deleteNoteS(id);
    }
}
