package BoardWeb.repository;

import BoardWeb.dto.BoardDTO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    @Select(value = "SELECT * FROM board")
    List<BoardDTO> getBoardList();
}
