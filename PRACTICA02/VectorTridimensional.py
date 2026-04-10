class VectorTridimensional:
    def __init__(self, x=0, y=0, z=0):
        self.x = x
        self.y = y
        self.z = z
    def __add__(self, otro):
        return VectorTridimensional(
            self.x + otro.x,
            self.y + otro.y,
            self.z + otro.z
        )
    def __mul__(self, r):
        return VectorTridimensional(
            self.x * r,
            self.y * r,
            self.z * r
        )
    def longitud(self):
        return (self.x**2 + self.y**2 + self.z**2) ** 0.5
    def normal(self):
        guardar_longitud = self.longitud()
        return VectorTridimensional(
            self.x / guardar_longitud,
            self.y / guardar_longitud,
            self.z / guardar_longitud
        )
    def producto_punto(self, otro):
        return self.x * otro.x + self.y * otro.y + self.z * otro.z
    def producto_cruz(self, otro):
        return VectorTridimensional(
            self.y * otro.z - self.z * otro.y,
            self.z * otro.x - self.x * otro.z,
            self.x * otro.y - self.y * otro.x
        )
    def __str__(self):
        return f"({self.x}, {self.y}, {self.z})"

a = VectorTridimensional(2, -1, 4)
b = VectorTridimensional(0, 3, -2)

print("Suma:", a + b)
print("Escalar:", a * 2)
print("Longitud de a:", a.longitud())
print("Normal de a:", a.normal())
print("Producto punto:", a.producto_punto(b))
print("Producto cruz:", a.producto_cruz(b))