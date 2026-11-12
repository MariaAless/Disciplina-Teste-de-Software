def calcular_frete(peso_gramas: int) -> int:
    if peso_gramas <= 1000:
        return 10
    return 20