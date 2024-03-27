data class Contact(
    var name: String,
    var phoneNumber: String,
    var email: String,
    var otherInfo: String // Pode ser usado para armazenar outras informações relevantes
)

class ContactManager {
    private val contacts = mutableListOf<Contact>()

    fun addContact(contact: Contact) {
        contacts.add(contact)
    }

    fun editContact(index: Int, contact: Contact) {
        contacts[index] = contact
    }

    fun deleteContact(index: Int) {
        contacts.removeAt(index)
    }

    fun searchContact(keyword: String): List<Contact> {
        return contacts.filter { contact ->
            contact.name.contains(keyword, ignoreCase = true) ||
                    contact.phoneNumber.contains(keyword) ||
                    contact.email.contains(keyword, ignoreCase = true) ||
                    contact.otherInfo.contains(keyword, ignoreCase = true)
        }
    }

    fun getAllContacts(): List<Contact> {
        return contacts
    }
}

fun main() {
    val contactManager = ContactManager()

    // Exemplo de utilização
    val contact1 = Contact("João", "123456789", "joao@example.com", "Amigo")
    val contact2 = Contact("Maria", "987654321", "maria@example.com", "Colega")

    contactManager.addContact(contact1)
    contactManager.addContact(contact2)

    println("Todos os contatos:")
    contactManager.getAllContacts().forEachIndexed { index, contact ->
        println("$index: ${contact.name} - ${contact.phoneNumber} - ${contact.email} - ${contact.otherInfo}")
    }

    println("\nPesquisar contatos com a palavra 'Maria':")
    val searchResults = contactManager.searchContact("Maria")
    searchResults.forEachIndexed { index, contact ->
        println("$index: ${contact.name} - ${contact.phoneNumber} - ${contact.email} - ${contact.otherInfo}")
    }
}