package src.Adapter

class CacheClientAdapter: ICache {
    val cacheClient: CacheClient

    constructor(cacheClient: CacheClient) {
        this.cacheClient = cacheClient
    }

    override fun get(key: String): String? {
        return this.cacheClient.getValueFromKey(key)
    }

    override fun set(key: String, value: String) {
        this.cacheClient.setKeyValue(key, value)
    }
}
