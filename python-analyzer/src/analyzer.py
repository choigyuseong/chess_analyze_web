import chess
import chess.engine

def analyze_pgn(pgn_path):
    """
    PGN 파일 경로를 받아서 분석 결과를 반환한다.
    """
    return {
        "status": "ok",
        "message": f"Analyzed {pgn_path}"
    }


if __name__ == "__main__":
    result = analyze_pgn("sample.pgn")
    print(result)