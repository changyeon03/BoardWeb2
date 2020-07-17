package BoardWeb.controller;

import BoardWeb.dto.BoardDTO;
import BoardWeb.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/board/")
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public void getBoardList(Model model) throws Exception {
        List<BoardDTO> list = boardService.getBoardList();
        model.addAttribute("list", list);
    }
    /*
    @RequestMapping(value = "view", method = RequestMethod.GET)
    public String viewBoard(@RequestParam("id") Long id)
    {
        return "/"
    }
     */
}
