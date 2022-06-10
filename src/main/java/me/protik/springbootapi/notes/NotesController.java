package me.protik.springbootapi.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.basic.BasicListUI;
import java.util.Arrays;
import java.util.List;

@RestController
public class NotesController {

    @GetMapping("/notes")
    public List<Notes> allNotes(){
        return Arrays.asList(
                new Notes("01","Note 1", "This is note 1 body"),
                new Notes("01","Note 1", "This is note 1 body"),
                new Notes("01","Note 1", "This is note 1 body")
                );
    }
}
