package mjv.school.gameProject.Controller;

import mjv.school.gameProject.Repository.PedidoRepository;
import mjv.school.gameProject.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService service;
}
