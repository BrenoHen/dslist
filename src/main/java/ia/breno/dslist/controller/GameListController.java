package ia.breno.dslist.controller;

import ia.breno.dslist.dto.GameDTO;
import ia.breno.dslist.dto.GameListDTO;
import ia.breno.dslist.dto.GameMinDTO;
import ia.breno.dslist.services.GameListService;
import ia.breno.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
