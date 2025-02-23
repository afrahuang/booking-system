package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

	@Query(value = "SELECT * FROM project_room WHERE capacity >= :capacity", nativeQuery = true)
	List<Room> findRoomOvercapacity(Long capacity);
}
