class Transportadora {
    var nome:String? = null
    var endereco:String? = null
    var telefoneComercial:String? = null
    var email:String? = null

    constructor(
        nome:String,
        endereco:String,
        telefoneComercial:String,
        email:String) {
        this.nome = nome
        this.endereco = endereco
        this.telefoneComercial = telefoneComercial
        this.email = email
    }

    override fun toString(): String {
        return "Nome: ${this.nome}, Endereco:${this.endereco}, Telefone comercial: ${this.telefoneComercial}, Email: ${this.email}"
    }
}