package mjv.school.gameProject.model;

import mjv.school.gameProject.enumeration.EnumStatusPedido;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_pedido")
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_compra", nullable = false)
    private LocalDate dataCompra;

    @Enumerated(value = EnumType.STRING)
    private EnumStatusPedido statusPedido;

    @Column(name = "valor_total_compra", nullable = false)
    private Double valorTotalCompra;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private  List<PedidoItemModel> listaItem = new ArrayList<>();


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

    public Double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(Double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public EnumStatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(EnumStatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public List<PedidoItemModel> getListaItem() {
        return listaItem;
    }

    public void setListaItem(List<PedidoItemModel> listaItem) {
        this.listaItem = listaItem;
    }
}
