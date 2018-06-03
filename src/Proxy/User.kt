package src.Proxy

class User(override val username: String): IUser {
    override fun getExclusiveContent(): String {
        return "Not allowed"
    }
}
