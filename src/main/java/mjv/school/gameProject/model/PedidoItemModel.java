package mjv.school.gameProject.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_pedido_item")
public class PedidoItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "produto_id")
    private ProdutoModel produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }
}
