package src.Adapter

interface ICache {
    fun get(key: String): String?
    fun set(key: String, value: String)
}