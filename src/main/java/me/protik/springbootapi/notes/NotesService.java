package me.protik.springbootapi.notes;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NotesService {
    private List<Notes> allNotes = new ArrayList<>(Arrays.asList(
                new Notes("01","Note 1", "This is note 1 body"),
                new Notes("02","Note 1", "This is note 1 body"),
                new Notes("03","Note 1", "This is note 1 body")
        ));

    public List<Notes> getAllNotesS() {
        return allNotes;
    }
    public Notes getOneNoteS( String id) {
        return allNotes.stream().filter(notes -> notes.getId().equals(id)).findFirst().get();
    }
    public void addNoteS( Notes note){
        allNotes.add(note);
    }

    public void editNoteS(Notes note, String id) {
        for(int i = 0; i < allNotes.size(); i++){
            if (allNotes.get(i).getId().equals(id)){ allNotes.set(i, note);
            }
        };
    }
    public void deleteNoteS(String id) {
        for(int i = 0; i < allNotes.size(); i++){
            if (allNotes.get(i).getId().equals(id)){ allNotes.remove(i);
            }
        };
    }
}
