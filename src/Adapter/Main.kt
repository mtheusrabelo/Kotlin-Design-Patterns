package src.Adapter

fun main(args: Array<String>) {
    val cacheClient: CacheClient = CacheClient()
    val cache: ICache = CacheClientAdapter(cacheClient)
    cache.set("hi", "Hi, there")
    println(cache.get("hi"))
}
