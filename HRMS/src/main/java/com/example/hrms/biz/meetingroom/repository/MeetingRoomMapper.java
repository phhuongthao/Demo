package com.example.hrms.biz.meetingroom.repository;

import com.example.hrms.biz.meetingroom.model.MeetingRoom;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MeetingRoomMapper {
    @Select("SELECT * FROM Meeting_Rooms WHERE room_id = #{roomId}")
    MeetingRoom getMeetingRoomById(Long roomId);
@Select("SELECT * FROM  Meeting_Rooms")
List<MeetingRoom> getAllMeetingRooms();
    @Insert("INSERT INTO Meeting_Rooms(room_name, location, capacity) VALUES(#{roomName}, #{location}, #{capacity})")
    void insertMeetingRoom(MeetingRoom meetingRoom);

    @Update("UPDATE Meeting_Rooms SET room_name = #{roomName}, location = #{location}, capacity = #{capacity} WHERE room_id = #{roomId}")
    void updateMeetingRoom(MeetingRoom meetingRoom);

    @Delete("DELETE FROM Meeting_Rooms WHERE room_id = #{roomId}")
    void deleteMeetingRoom(Long roomId);
}