from frete import calcular_frete


def test_frete_produto_500g():
    assert calcular_frete(500) == 10