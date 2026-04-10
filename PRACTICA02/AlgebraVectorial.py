class AlgebraVectorial:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    def producto_punto(self, otro):
        return self.x * otro.x + self.y * otro.y
    def modulo(self):
        return (self.x**2 + self.y**2) ** 0.5
    def perpendicular(self, *args):
        if len(args) == 1:
            b = args[0]
            if self.producto_punto(b) == 0:
                return True
            return self.producto_punto(b) == 0
    def paralelo(self, *args):
        if len(args) == 1:
            b = args[0]
            return self.x * b.y - self.y * b.x == 0
    def proyeccion(self, b):
        escalar = self.producto_punto(b) / (b.modulo()**2)
        return AlgebraVectorial(b.x * escalar, b.y * escalar)
    def componente(self, b):
        return self.producto_punto(b) / b.modulo()


a = AlgebraVectorial(6, 9)
b = AlgebraVectorial(2, 3)

print("Perpendiculares:", a.perpendicular(b))
print("Paralelos:", a.paralelo(b))

projec = a.proyeccion(b)
print("Proyeccion:", projec.x, projec.y)
print("Componente:", a.componente(b))