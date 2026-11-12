import pytest
from frete import calcular_frete

def test_frete_produto_500g():
    assert calcular_frete(500) == 10

def test_frete_produto_2000g():
    assert calcular_frete(2000) == 20

def test_frete_produto_6000g():
    assert calcular_frete(6000) == 30

def test_frete_limites_faixa_1():
    assert calcular_frete(1) == 10
    assert calcular_frete(1000) == 10


def test_frete_limite_inicio_faixa_2():
    assert calcular_frete(1001) == 20


def test_frete_limite_fim_faixa_2():
    assert calcular_frete(5000) == 20


def test_frete_limite_inicio_faixa_3():
    assert calcular_frete(5001) == 30

def test_frete_peso_zero():
    with pytest.raises(ValueError):
        calcular_frete(0)


def test_frete_peso_negativo():
    with pytest.raises(ValueError):
        calcular_frete(-1)