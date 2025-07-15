import src.analyzer as analyzer

def test_analyze_pgn():
    result = analyzer.analyze_pgn("sample.pgn")
    assert result["status"] == "ok"