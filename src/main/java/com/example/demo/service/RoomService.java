package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Room;
import com.example.demo.repository.RoomRepository;

@Service
public class RoomService {
	private final RoomRepository roomRepository;

	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	public Room searchRoom(Long id) {
		return roomRepository.findById(id).orElse(null);
	}

	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}

	public Room getRoomById(Long id) {
		Optional<Room> room = roomRepository.findById(id);
		return room.orElseThrow(() -> new RuntimeException("Room ID not found :" + id));
	}

	public List<Room> getRoomOvercapacity(Long capacity) {
		return roomRepository.findRoomOvercapacity(capacity);
	}
}
