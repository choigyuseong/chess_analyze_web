> **사용법**
>
> 1. 에디터에서 `README.md` 파일을 연다.
> 2. 커서부터 끝까지 전부 선택(또는 복사) → 붙여넣기
> 3. 저장 후 미리보기(또는 GitHub 리포지토리)에서 확인

---

# Chess Analyzer 프로젝트 계획서

## 📖 프로젝트 개요

* **프로젝트명**: Chess Analyzer
* **목적**n
  * 오프라인 체스 기보 분석기 구현
  * PGN 파일 자동 수집·분석
  * 최적 수 추천, 실수/악수 하이라이트, 승률 그래프 제공
  * Python 기반 분석 로직 + Spring Boot 웹 서비스

## 🎯 주요 기능

1. **자동 기보 수집**

   * Chess.com API로 사용자의 월별/일별 대국 PGN 자동 다운로드
2. **분석 엔진**

   * Stockfish + `python-chess` 기반 수별 평가
   * blunder, mistake, inaccuracy 감지
   * 대안 수(alternative moves) 추천
   * 예상 승률 변화 그래프
3. **웹 인터페이스**

   * Spring Boot REST API
   * React 또는 Thymeleaf를 이용한 결과 시각화
4. **결과 저장**

   * JSON, Markdown, HTML 등으로 분석 결과 내보내기

## 📂 디렉터리 구조

chess-analyzer/
├── python-analyzer/         ← Python 분석기 모듈
│   ├── venv/                ← (gitignore)
│   ├── requirements.txt     ← 의존성 목록
│   └── src/
│       └── analyzer.py      ← 분석 스크립트
├── spring-backend/          ← Spring Boot 백엔드 모듈
│   ├── build.gradle         ← Gradle 설정
│   └── src/
│       ├── main/
│       │   ├── java/com/example/…
│       │   └── resources/
│       └── test/
└── settings.gradle.kts      ← 멀티모듈 설정

## 🛠️ 기술 스택

* **분석 로직**: Python 3.10+, `python-chess`, `stockfish`, `requests`
* **백엔드**: Java 21, Spring Boot 3.1.x, Jackson
* **프론트엔드** (옵션): React, Chessboard.js / chessground
* **데이터베이스** (옵션): PostgreSQL

## 🚀 설치 및 실행

1. **클론 & 멀티모듈 설정**

   ```bash
   git clone https://github.com/your-username/chess-analyzer.git
   cd chess-analyzer
   ```

2. **Python 모듈 준비**

   ```bash
   cd python-analyzer
   python3 -m venv venv
   source venv/bin/activate
   pip install -r requirements.txt
   ```

3. **Spring Boot 모듈 실행**

   ```bash
   cd ../spring-backend
   ./gradlew bootRun
   ```

4. **분석기 사용 예시**

   * 브라우저 또는 REST 클라이언트에서
     `http://localhost:8080/api/analyze`
     → PGN 파일 업로드 후 JSON 형태 결과 확인

## 📝 향후 계획

* CI/CD: GitHub Actions로 Python/Java 빌드·테스트 자동화
* 웹 UI 개선: React + Redux + Chart.js 연동
* 사용자 인증 및 개인별 대국 이력 관리

## 🤝 기여

1. Fork 프로젝트
2. 새 브랜치 생성 (`git checkout -b feature/foo`)
3. 기능 구현 및 커밋 (`git commit -am 'Add foo'`)
4. Push 및 Pull Request 생성

## 📄 라이선스

* MIT License
