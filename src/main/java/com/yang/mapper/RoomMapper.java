package com.yang.mapper;

import com.yang.model.Room;
import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Room record);

    Room selectByPrimaryKey(Long id);

    List<Room> selectAll();

    int updateByPrimaryKey(Room record);

    Room selectById(String roomId);

}