# kafka-rss-feed

> Apache Kafka를 활용하는 RSS Feed 크롤러

## 요구사항
- [v] RSS Feed를 크롤링할 수 있어야 합니다.
- [v] 크롤링한 데이터를 Kafka로 넘길 수 있어야 합니다.
- [v] Kafka에서 데이터를 받아와 액션을 취할 수 있어야 합니다.
- [ ] 받아온 데이터를 데이터베이스에 저장해야 합니다.
- [v] 헥사고날 아키텍처를 적용해야 합니다.
- [v] Kotlin MultiModule을 적용하여 Producer와 Consumer를 분리해야 합니다.
- [ ] RSS Feed 외의 웹 사이트 크롤러를 만들어 확장할 수 있어야 합니다.
