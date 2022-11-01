package mjv.school.gameProject.dto.pedido;

import mjv.school.gameProject.enumeration.EnumStatusPedido;
import mjv.school.gameProject.model.ProdutoModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoComId {

    private Long id;
    private LocalDate dataCompra;
    private EnumStatusPedido statusPedido;
    private Double valorTotalCompra;
    private List<ProdutoModel> listaProduto = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public EnumStatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(EnumStatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(Double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public List<ProdutoModel> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<ProdutoModel> listaProduto) {
        this.listaProduto = listaProduto;
    }
}
