package src.Proxy

class Premium(user: IUser): IUser by user {
    override fun getExclusiveContent(): String {
        return "Exclusive content"
    }
}
