package BoardWeb.service;

import BoardWeb.dto.BoardDTO;
import BoardWeb.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getBoardList() {
        return boardMapper.getBoardList();
    }
}
