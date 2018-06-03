package src.Builder

class HouseBuilder () {
    var hasWindow: Boolean = false
    var hasDoor: Boolean = false
    var hasWall: Boolean = false

    fun addWindow() {
        this.hasWindow = true
    }

    fun addDoor() {
        this.hasDoor = true
    }

    fun addWall() {
        this.hasWall = true
    }

    fun build(): House {
        return House(this)
    }
}
