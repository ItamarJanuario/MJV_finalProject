package mjv.school.gameProject.controller;

import mjv.school.gameProject.dto.pedido.PedidoDTO;
import mjv.school.gameProject.enumeration.EnumStatusPedido;
import mjv.school.gameProject.model.PedidoModel;
import mjv.school.gameProject.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService service;

    @GetMapping()
    public List<PedidoModel> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PedidoModel buscarPedido(@PathVariable(name = "id")Long id) {
        return service.buscarPedido(id);
    }

//    @PostMapping("/novo")
//    public PedidoModel insert() {
//        return service.insert();
//    }

    @PostMapping("/novo")
    public void insert(@RequestParam(name = "usuario") Long usuarioId) {
         service.insert(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id")Long id){

    }

   @PatchMapping("/{id}/adicionar")
    public void insertItem(@PathVariable(name = "id")Long id, @RequestParam(name = "item")Long itemId){
        service.adicionarItem(id, itemId);
   }


    @PatchMapping("/{id}/atualizar")
    public void updateItem(@PathVariable(name = "id") Long id, @RequestParam(name = "status")EnumStatusPedido statusPedido) {
        service.update(id, statusPedido);
    }


    @PatchMapping("/{id}/remover")
    public void removerItem(@PathVariable(name = "id") Long id, @RequestParam(name = "item") Long itemId) {
        service.removerItem(id, itemId);
    }
}
