package src.Builder

class House {
    var hasWindow: Boolean = false
    var hasDoor: Boolean = false
    var hasWall: Boolean = false

    constructor(builder: HouseBuilder) {
        this.hasWindow = builder.hasWindow
        this.hasDoor = builder.hasDoor
        this.hasWall = builder.hasWall
    }
}
