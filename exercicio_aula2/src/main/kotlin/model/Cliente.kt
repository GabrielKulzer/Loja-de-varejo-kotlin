import java.time.LocalDate

class Cliente {
    var nome:String
    var cpf:String
    var endereco:String
    var dataNascimento:LocalDate
    var telefoneComercial:String
    var email:String

    constructor(
        nome:String,
        cpf:String,
        endereco:String,
        dataNascimento:LocalDate,
        telefoneComercial:String,
        email:String) {
        this.nome = nome
        this.cpf = cpf
        this.endereco = endereco
        this.dataNascimento = dataNascimento
        this.telefoneComercial = telefoneComercial
        this.email = email

    }

    override fun toString(): String {
        return "Nome: ${this.nome}, CPF: ${this.cpf}, Endereco: ${this.endereco}, Data de nascimento: ${this.dataNascimento}, Telefone comercial: ${this.telefoneComercial}, Email: ${this.email}"
    }
}