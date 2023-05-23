package com.supportportal.resource;

import com.supportportal.domain.Room;
import com.supportportal.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class RoomController {
    private RoomService roomService;
    @GetMapping("/Room")
    public List<Room> getRoom(){
        return roomService.getRoom();
    }

}
