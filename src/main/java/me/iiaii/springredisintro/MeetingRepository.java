package me.iiaii.springredisintro;


import org.springframework.data.repository.CrudRepository;

public interface MeetingRepository extends CrudRepository<Meeting, String> {
}
