package com.example.okay.repositories;

import com.example.okay.models.Song;
import org.springframework.data.repository.CrudRepository;


public interface SongRepository extends CrudRepository<Song, Long> {

}