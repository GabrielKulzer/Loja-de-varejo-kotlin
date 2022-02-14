class Venda {
    var quantidade:Short
    var valorTotal:Float
    var vendedor:Vendedor
    var produto:Produto
    var cliente:Cliente

    constructor(
        quantidade:Short,
        valorTotal:Float,
        vendedor:Vendedor,
        produto:Produto,
        cliente:Cliente) {
        this.quantidade = quantidade
        this.valorTotal = valorTotal
        this.vendedor = vendedor
        this. produto = produto
        this.cliente = cliente
    }

    override fun toString(): String {
        return "Quantidade: ${this.quantidade}, Valor Total: ${this.valorTotal}, Vendedor: ${this.vendedor}, Produto: ${this.produto}, Cliente: ${this.cliente}"
    }
}