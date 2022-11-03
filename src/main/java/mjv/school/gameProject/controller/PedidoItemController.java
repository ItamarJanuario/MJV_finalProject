package mjv.school.gameProject.controller;


import mjv.school.gameProject.model.PedidoItemModel;
import mjv.school.gameProject.service.PedidoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class PedidoItemController {
    @Autowired
    private PedidoItemService service;

    @GetMapping
    public List<PedidoItemModel> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PedidoItemModel getPedidoItem(@PathVariable(name = "id") Long id) {
        return service.buscarPedidoItem(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
    }

    @PostMapping("/novo")
    public void insert(PedidoItemModel pedidoItem) {
        service.insert(pedidoItem);
    }

    @PatchMapping("/{id}/atualizar")
    public void update(@PathVariable(name = "id") Long id, @RequestParam(name = "produto") Long produtoId) {
         service.update(id, produtoId);
    }
}
