package ia.breno.dslist.services;

import ia.breno.dslist.dto.GameListDTO;
import ia.breno.dslist.dto.GameMinDTO;
import ia.breno.dslist.entities.Game;
import ia.breno.dslist.entities.GameList;
import ia.breno.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
