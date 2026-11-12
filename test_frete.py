from frete import calcular_frete


def test_frete_produto_500g():
    assert calcular_frete(500) == 10

def test_frete_produto_2000g():
    assert calcular_frete(2000) == 20

def test_frete_produto_6000g():
    assert calcular_frete(6000) == 30