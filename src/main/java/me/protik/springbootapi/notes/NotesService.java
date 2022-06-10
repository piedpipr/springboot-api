package me.protik.springbootapi.notes;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NotesService {
    private List<Notes> allNotes = Arrays.asList(
                new Notes("01","Note 1", "This is note 1 body"),
                new Notes("02","Note 1", "This is note 1 body"),
                new Notes("03","Note 1", "This is note 1 body")
        );

    public List<Notes> getAllNotes() {
        return allNotes;
    }
}
