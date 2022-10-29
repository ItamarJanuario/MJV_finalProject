package mjv.school.gameProject.Model;

import mjv.school.gameProject.Enumeration.EnumStatusPedido;

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
    @JoinColumn(name = "produto_id")
    private  List<ProdutoModel> listaProduto = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<ProdutoModel> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<ProdutoModel> listaProduto) {
        this.listaProduto = listaProduto;
    }
}
