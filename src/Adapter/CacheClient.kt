package src.Adapter

class CacheClient {
    val cached: MutableMap<String, String> = mutableMapOf<String, String>()

    fun getValueFromKey(key: String): String? {
        return this.cached.get(key)
    }

    fun setKeyValue(key: String, value: String) {
        this.cached.put(key, value)
    }
}
