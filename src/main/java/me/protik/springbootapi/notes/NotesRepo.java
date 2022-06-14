package me.protik.springbootapi.notes;

import org.springframework.data.repository.CrudRepository;

public interface NotesRepo extends CrudRepository<Notes, String> {

}
