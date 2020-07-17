package BoardWeb.service;

import BoardWeb.dto.BoardDTO;
import BoardWeb.repository.BoardMapper;

import java.util.List;

public interface BoardService {
    public List<BoardDTO> getBoardList();
}
