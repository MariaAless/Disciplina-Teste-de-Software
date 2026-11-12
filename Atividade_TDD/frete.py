def calcular_frete(peso_gramas: int) -> int:
    if peso_gramas <= 0:
        raise ValueError("Peso deve ser positivo")

    if peso_gramas > 10000:
        raise ValueError("Peso acima do limite permitido")
    
    if peso_gramas <= 1000:
        return 10
    if peso_gramas <= 5000:
        return 20
    return 30