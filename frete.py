def calcular_frete(peso_gramas: int) -> int:
    if peso_gramas <= 1000:
        return 10
    if peso_gramas <= 5000:
        return 20
    return 30