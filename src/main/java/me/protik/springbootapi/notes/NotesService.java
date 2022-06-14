package me.protik.springbootapi.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NotesService {
    @Autowired
    private NotesRepo notesRepo;

    public List<Notes> getAllNotesS() {
//        return allNotes;
        List<Notes> allNotes = new ArrayList<>();
        notesRepo.findAll().forEach(allNotes::add);
        return allNotes;
    }
    public Optional<Notes> getOneNoteS(String id) {
//        return allNotes.stream().filter(notes -> notes.getId().equals(id)).findFirst().get();
       return notesRepo.findById(id);
    }
    public void addNoteS( Notes note){
//        allNotes.add(note);
        notesRepo.save(note);
    }

    public void editNoteS(Notes note, String id) {
//        for(int i = 0; i < allNotes.size(); i++){
//            if (allNotes.get(i).getId().equals(id)){ allNotes.set(i, note);
//            }
//        };
        notesRepo.save(note);
    }
    public void deleteNoteS(String id) {
//        for(int i = 0; i < allNotes.size(); i++){
//            if (allNotes.get(i).getId().equals(id)){ allNotes.remove(i);
//            }
//        };
        notesRepo.deleteById(id);
    }
}
