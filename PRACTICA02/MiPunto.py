class MiPunto:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    def distancia(self, *args):
        if len(args) == 1:
            p = args[0]
            dx = self.x - p.x
            dy = self.y - p.y
            return (dx**2 + dy**2) ** 0.5

        elif len(args) == 2:
            x, y = args
            dx = self.x - x
            dy = self.y - y
            return (dx**2 + dy**2) ** 0.5

p1 = MiPunto()
p2 = MiPunto(10, 30.5)

print("Punto 1:", p1.x, p1.y)
print("Punto 2:", p2.x, p2.y)

print("Distancia objeto:", p1.distancia(p2))
print("Distancia coordenadas:", p1.distancia(10, 30.5))